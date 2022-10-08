function getList() {
    $ajax({
        type: 'post',
        url: '/track/getList',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable(res.data);
            $("#trackTable").colResizable({
                liveDrag: true,
                gripInnerHtml: "<div class='grip'></div>",
                draggingClass: "dragging",
                resizeMode: 'fit'
            });
        }
    })
}

function getList2() {
    $ajax({
        type: 'post',
        url: '/track/getList2',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable2(res.data);
            $("#track2Table").colResizable({
                liveDrag: true,
                gripInnerHtml: "<div class='grip'></div>",
                draggingClass: "dragging",
                resizeMode: 'fit'
            });
        }
    })
}

$(function () {
    getList2();
    getList();

    //刷新
    $("#refresh-btn").click(function () {
        getList2();
        getList();
    });
});

function setTable2(data) {
    if ($('#track2Table').html != '') {
        $('#track2Table').bootstrapTable('load', data);
    }

    $('#track2Table').bootstrapTable({
        data: data,
        sortStable: true,
        classes: 'table table-hover text-nowrap table table-bordered',
        idField: 'id',
        pagination: true,
        pageSize: 15,//单页记录数
        clickToSelect: true,
        locale: 'zh-CN',
        toolbar: '#table-toolbar',
        toolbarAlign: 'left',
        theadClasses: "thead-light",//这里设置表头样式
        style:'table-layout:fixed',
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
                field: 'h',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'i',
                title: 'Dist between straights',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'j',
                title: 'r (=b)',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'k',
                title: 'dist bends @ r',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'l',
                title: 'dist straights',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'm',
                title: '% bend',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'n',
                title: 'a = r + dist from apex)',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'o',
                title: 'Ram. Ellipse perimeter black',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'p',
                title: 'Ram. Ellipse perimeter travelled',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'q',
                title: 'extra distance travelled',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'r',
                title: 'multiplier',
                align: 'center',
                sortable: true,
                width: 150,
            }
        ],
    })
}

function setTable(data) {
    if ($('#trackTable').html != '') {
        $('#trackTable').bootstrapTable('load', data);
    }

    $('#trackTable').bootstrapTable({
        data: data,
        sortStable: true,
        classes: 'table table-hover text-nowrap table table-bordered',
        idField: 'id',
        pagination: true,
        pageSize: 15,//单页记录数
        clickToSelect: true,
        locale: 'zh-CN',
        toolbar: '#table-toolbar',
        toolbarAlign: 'left',
        theadClasses: "thead-light",//这里设置表头样式
        style:'table-layout:fixed',
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
                field: 'kong',
                title: '',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'tradm',
                title: 'Tradm',
                align: 'center',
                sortable: true,
                width: 150,
            }, {
                field: 'bankanglerad',
                title: 'Bankanglerad',
                align: 'center',
                sortable: true,
                width: 150,
            }
        ],
    })
}