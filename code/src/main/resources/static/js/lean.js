function getList() {
    $ajax({
        type: 'post',
        url: '/lean/getList',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable(res.data);
            $("#leanTable").colResizable({
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
        url: '/lean/getList2',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable2(res.data);
            $("#lean2Table").colResizable({
                liveDrag: true,
                gripInnerHtml: "<div class='grip'></div>",
                draggingClass: "dragging",
                resizeMode: 'fit'
            });
        }
    })
}

function getList3() {
    $ajax({
        type: 'post',
        url: '/lean/getList3',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            setTable3(res.data);
            $("#lean3Table").colResizable({
                liveDrag: true,
                gripInnerHtml: "<div class='grip'></div>",
                draggingClass: "dragging",
                resizeMode: 'fit'
            });
        }
    })
}

$(function () {
    getList3();
    getList2();
    getList();

    //刷新
    $("#refresh-btn").click(function () {
        getList3();
        getList2();
        getList();
    });
});

function setTable(data) {
    if ($('#leanTable').html != '') {
        $('#leanTable').bootstrapTable('load', data);
    }

    $('#leanTable').bootstrapTable({
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
                field: 'a',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'b',
                title: '1',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'c',
                title: '2',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'd',
                title: '3',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'e',
                title: '4',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'f',
                title: '5',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'g',
                title: '6',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'h',
                title: '7',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'i',
                title: '8',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'j',
                title: '9',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'k',
                title: '10',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'l',
                title: '11',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'm',
                title: '12',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'n',
                title: '13',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'o',
                title: '14',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'p',
                title: '15',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'q',
                title: '16',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'r',
                title: '17',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 's',
                title: '18',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 't',
                title: '19',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'u',
                title: '20',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'v',
                title: '21',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'w',
                title: '22',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'x',
                title: '23',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'y',
                title: '24',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'z',
                title: '25',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'aa',
                title: '26',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ab',
                title: '27',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ac',
                title: '28',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ad',
                title: '29',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ae',
                title: '30',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'af',
                title: '31',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ag',
                title: '32',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ah',
                title: '33',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ai',
                title: '34',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'aj',
                title: '35',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ak',
                title: '36',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'al',
                title: '37',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'am',
                title: '38',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'an',
                title: '39',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ao',
                title: '40',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'ap',
                title: '41',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
        // onClickRow: function (row, el) {
        //     let isSelect = $(el).hasClass('selected');
        //     if (isSelect) {
        //         $(el).removeClass('selected')
        //     } else {
        //         $(el).addClass('selected')
        //     }
        // }
    })
}

function setTable2(data) {
    if ($('#lean2Table').html != '') {
        $('#lean2Table').bootstrapTable('load', data);
    }

    $('#lean2Table').bootstrapTable({
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
                field: 'au',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'av',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
    })
}

function setTable3(data) {
    if ($('#lean3Table').html != '') {
        $('#lean3Table').bootstrapTable('load', data);
    }

    $('#lean3Table').bootstrapTable({
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
                field: 'ba',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'bb',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
    })
}