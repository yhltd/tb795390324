function getList() {
    $ajax({
        type: 'post',
        url: '/calcs/getList',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable(res.data);
        }
    })
}

$(function () {
    getList();

    //刷新
    $("#refresh-btn").click(function () {
        getList();
    });

    //添加一行数据
    $("#add-btn").click(function () {
        $ajax({
            type: 'post',
            url: '/calcs/add',
            async: false,
        }, false, '', function (res) {
            if (res.code == 200) {
                alert(res.msg);
                getList();
            }
        })
    });

    //点击删除按钮
    $('#delete-btn').click(function () {
        var msg = confirm("确认要删除吗？");
        if (msg) {
            let rows = getTableSelection("#calcsTable");
            if (rows.length == 0) {
                alert('请选择要删除的数据！');
                return;
            }
            let idList = [];
            $.each(rows, function (index, row) {
                idList.push(row.data.id)
            });
            $ajax({
                type: 'post',
                url: '/calcs/delete',
                data: JSON.stringify({
                    idList: idList
                }),
                dataType: 'json',
                contentType: 'application/json;charset=utf-8'
            }, false, '', function (res) {
                if (res.code == 200) {
                    alert(res.msg);
                    getList();
                }
            })
        }
    })
});

function setTable(data) {
    if ($('#calcsTable').html != '') {
        $('#calcsTable').bootstrapTable('load', data);
    }

    $('#calcsTable').bootstrapTable({
        data: data,
        sortStable: true,
        classes: 'table table-hover text-nowrap table table-bordered',
        idField: 'id',
        pagination: true,
        pageSize: 15,//单页记录数
        clickToSelect: false,
        locale: 'zh-CN',
        toolbar: '#table-toolbar',
        toolbarAlign: 'left',
        theadClasses: "thead-light",//这里设置表头样式
        style: 'table-layout:fixed',
        columns: [
            {
                field: '',
                title: '序号',
                align: 'center',
                width: 50,
                formatter: function (value, row, index) {
                    return index + 1;
                }
            }, {
                field: 'b',
                title: 'time',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'c',
                title: 'Turn ID',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'd',
                title: 'Rider P1',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'e',
                title: 'Rider P2',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'f',
                title: 'Rider P3',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'g',
                title: 'Rider P4',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'h',
                title: 'Total dist',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'i',
                title: 'Power in, W',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'j',
                title: 'Rider lead turn #',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'k',
                title: 'Vel_CoM',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'l',
                title: 'CoM_dist',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'm',
                title: 'wheel_dist',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'n',
                title: 'wheel_speed',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'o',
                title: 'Turn distance',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'p',
                title: 'Turn length',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'q',
                title: 'Half lap ID',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'r',
                title: 'Dist at end of this half lap',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 's',
                title: 'End of half lap',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 't',
                title: 'Half lap time',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'u',
                title: 'Half lap dist',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'v',
                title: 'Percent half lap',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'w',
                title: 'Turn radius lookup, m',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'x',
                title: 'Bank angle lookup, radians',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'y',
                title: 'Initial lean angle lookup, radians',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'z',
                title: 'Seat height',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'aa',
                title: 'Mass',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ab',
                title: 'CDA',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ac',
                title: 'Loop_1',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ad',
                title: 'Loop_2',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ae',
                title: 'Loop_3',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'af',
                title: 'Converged lean angle, degrees',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ag',
                title: 'Angle from horizontal, degrees',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ah',
                title: 'R_com',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ai',
                title: 'Angular velocity',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'aj',
                title: 'F_Normal',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ak',
                title: 'F_normal_front',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'al',
                title: 'F_normal_rear',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'am',
                title: 'Force_RR_Front',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'an',
                title: 'Force_RR_Rear',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ao',
                title: 'Power_RR v_whl Front',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ap',
                title: 'Power_RR v_whl Rear',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'aq',
                title: 'betadash',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ar',
                title: 'Sigma',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'as',
                title: 'Rel airspeed',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'at',
                title: 'Power RR',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'au',
                title: 'Aero Power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'av',
                title: 'Net Power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'aw',
                title: 'Net propulsive force',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ax',
                title: 'accel',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ay',
                title: 'Energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'az',
                title: 'P1 Energy cumulative',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ba',
                title: 'end of turn?',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bb',
                title: 'W/CDA',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bc',
                title: 'P1 accel power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bd',
                title: 'Following positions >>>',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'be',
                title: 'P2 aero power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bf',
                title: 'P2 roll power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bg',
                title: 'P2 accel power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bh',
                title: 'P2 power in',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bi',
                title: 'P2 Energy cumulative',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bj',
                title: 'P3 aero power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bk',
                title: 'P3 roll power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bl',
                title: 'P3 accel power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bm',
                title: 'p3 power in',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bn',
                title: 'P3 energy cumulative',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bo',
                title: 'P4 aero power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bp',
                title: 'P4 roll power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bq',
                title: 'P4 accel power',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'br',
                title: 'p4 power in',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bs',
                title: 'P4 energy cumulative',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bt',
                title: 'A',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bu',
                title: 'A energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bv',
                title: 'A,cumulative energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bw',
                title: 'over threshold energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bx',
                title: 'cumulative O-T energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'by',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bz',
                title: '5 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ca',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cb',
                title: '60 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cc',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cd',
                title: '3 min moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ce',
                title: 'E',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cf',
                title: 'E energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cg',
                title: 'E, cumulative energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ch',
                title: 'over threshold energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ci',
                title: 'cumulative O-T energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cj',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ck',
                title: '5 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cl',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cm',
                title: '60 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cn',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'co',
                title: '3 min moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cp',
                title: 'D',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cq',
                title: 'D energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cr',
                title: 'D, cumulative energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cs',
                title: 'over threshold energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'ct',
                title: 'cumulative O-T energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cu',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cv',
                title: '5 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cw',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cx',
                title: '60 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cy',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'cz',
                title: '3 min moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'da',
                title: 'B',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'db',
                title: 'B energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dc',
                title: 'B, cumulative energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dd',
                title: 'over threshold energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'de',
                title: 'cumulative O-T energy',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'df',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dg',
                title: '5 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dh',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'di',
                title: '60 sec moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dj',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'dk',
                title: '3 min moving average',
                align: 'center',
                sortable: true,
                width: 150,
            }
        ],
        onClickRow: function (row, el) {
            let isSelect = $(el).hasClass('selected');
            if (isSelect) {
                $(el).removeClass('selected')
            } else {
                $(el).addClass('selected')
            }
        }
    })
}