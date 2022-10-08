let input = [];
let input2 = [];
let input3 = [];
let input4 = [];
let input5 = [];
let input6 = [];

function getList() {
    $ajax({
        type: 'post',
        url: '/input/getList',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            res.data[0].a = "P1";
            res.data[1].a = "P2";
            res.data[2].a = "P3";
            res.data[3].a = "P4";

            res.data[0].c = res.data[1].b;
            res.data[1].c = res.data[2].b;
            res.data[2].c = res.data[3].b;
            res.data[3].c = res.data[0].b;

            res.data[0].d = res.data[2].b;
            res.data[1].d = res.data[3].b;
            res.data[2].d = res.data[0].b;
            res.data[3].d = res.data[1].b;

            res.data[0].e = res.data[3].b;
            res.data[1].e = res.data[0].b;
            res.data[2].e = res.data[1].b;
            res.data[3].e = res.data[2].b;

            input = res.data;
        }
    })
}

function getList2() {
    $ajax({
        type: 'post',
        url: '/input/getList2',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            input2 = res.data;
        }
    })
}

function getList3() {
    $ajax({
        type: 'post',
        url: '/input/getList3',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            res.data[0].a = input[0].b;
            res.data[1].a = input[1].b;
            res.data[2].a = input[2].b;
            res.data[3].a = input[3].b;
            input3 = res.data;
        }
    })
}

function getList4() {
    $ajax({
        type: 'post',
        url: '/input/getList4',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            input4 = res.data;
        }
    })
}

function getList5() {
    $ajax({
        type: 'post',
        url: '/input/getList5',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            input5 = res.data;
        }
    })
}

function getList6() {
    $ajax({
        type: 'post',
        url: '/input/getList6',
        async: false,
    }, false, '', function (res) {
        if (res.code == 200) {
            input6 = res.data;
        }
    })
}


$(function () {
    getList();
    getList2();
    getList3();
    getList4();
    getList5();
    getList6();

    setTable2(input2);
    setTable3(input3);
    setTable4(input4);
    setTable5(input5);
    setTable6(input6);
    setTable(input);

    //刷新
    $("#refresh-btn").click(function () {
        input = [];
        input2 = [];
        input3 = [];
        input4 = [];
        input5 = [];
        input6 = [];

        getList();
        getList2();
        getList3();
        getList4();
        getList5();
        getList6();

        setTable2(input2);
        setTable3(input3);
        setTable4(input4);
        setTable5(input5);
        setTable6(input6);
        setTable(input);
    });
});

function setTable(data) {
    if ($('#inputTable').html != '') {
        $('#inputTable').bootstrapTable('load', data);
    }

    $('#inputTable').bootstrapTable({
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
                title: 'Start order',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'b',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="B' + row.id + '" onblur="javascript:columnUpd(' + row.id + ',' + '\'B\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'c',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'd',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'e',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
    })
}

function setTable2(data) {
    if ($('#input2Table').html != '') {
        $('#input2Table').bootstrapTable('load', data);
    }

    $('#input2Table').bootstrapTable({
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
                title: 'Start order',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'b',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="B2' + row.id + '" onblur="javascript:columnUpd2(' + row.id + ',' + '\'B\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'c',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
    })
}

function setTable3(data) {
    if ($('#input3Table').html != '') {
        $('#input3Table').bootstrapTable('load', data);
    }

    $('#input3Table').bootstrapTable({
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
                title: 'Turn 1',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="B3' + row.id + '" onblur="javascript:columnUpd3(' + row.id + ',' + '\'B\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'c',
                title: 'Turn 2',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="C3' + row.id + '" onblur="javascript:columnUpd3(' + row.id + ',' + '\'C\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'd',
                title: 'Turn 3',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="D3' + row.id + '" onblur="javascript:columnUpd3(' + row.id + ',' + '\'D\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'e',
                title: 'Turn 4',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="E3' + row.id + '" onblur="javascript:columnUpd3(' + row.id + ',' + '\'E\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'f',
                title: 'Turn 5',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="F3' + row.id + '" onblur="javascript:columnUpd3(' + row.id + ',' + '\'F\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }
        ],
    })
}

function setTable4(data) {
    if ($('#input4Table').html != '') {
        $('#input4Table').bootstrapTable('load', data);
    }

    $('#input4Table').bootstrapTable({
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
                title: 'CDA scaling',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'b',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="B4' + row.id + '" onblur="javascript:columnUpd4(' + row.id + ',' + '\'B\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }
        ],
    })
}

function setTable5(data) {
    if ($('#input5Table').html != '') {
        $('#input5Table').bootstrapTable('load', data);
    }

    $('#input5Table').bootstrapTable({
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
                field: 'g',
                title: 'Rider ID',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'h',
                title: 'Rider profiles',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="H5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'H\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'i',
                title: 'Mass',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="I5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'I\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'j',
                title: 'CDA seated (solo measurement)',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="J5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'J\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'k',
                title: 'Seat height from ground, m',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="K5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'K\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'l',
                title: 'Critical power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="L5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'L\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: '',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'n',
                title: 'Turn 1 power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="N5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'N\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'o',
                title: 'Turn 2 power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="O5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'O\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'p',
                title: 'Turn 3 power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="P5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'P\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'q',
                title: 'Turn 4 power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="Q5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'Q\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'r',
                title: 'Turn 5 power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="R5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'R\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 's',
                title: 'CDA standing',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="S5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'S\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: '',
                title: 'Ave lead W / CDA',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: '',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'v',
                title: 'Rider limit values:',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="V5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'V\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'w',
                title: 'Energy total, KJ',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="W5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'W\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'x',
                title: 'Over CP energy, KJ',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="X5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'X\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'y',
                title: '5 sec power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="Y5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'Y\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'z',
                title: '1 min power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="Z5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'Z\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'aa',
                title: '3 min power',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="AA5' + row.id + '" onblur="javascript:columnUpd5(' + row.id + ',' + '\'AA\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }
        ],
    })
}

function setTable6(data) {
    if ($('#input6Table').html != '') {
        $('#input6Table').bootstrapTable('load', data);
    }

    $('#input6Table').bootstrapTable({
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
                field: 'f',
                title: 'Quick Increments',
                align: 'center',
                sortable: true,
                width: 100,
            }, {
                field: 'g',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
                formatter: function (value, row, index) {
                    return '<input id="G6' + row.id + '" onblur="javascript:columnUpd6(' + row.id + ',' + '\'G\'' + ')" value="' + value + '" class="form-control" style="width: 95%;font-size:13px"  >'
                }
            }, {
                field: 'h',
                title: '',
                align: 'center',
                sortable: true,
                width: 100,
            }
        ],
    })
}

function columnUpd(id, column) {
    var this_value = $('#' + column + id).val();
    $ajax({
        type: 'post',
        url: '/input/save',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function columnUpd2(id, column) {
    var this_value = $('#' + column + '2' + id).val();
    $ajax({
        type: 'post',
        url: '/input/save2',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function columnUpd3(id, column) {
    var this_value = $('#' + column + '3' + id).val();
    $ajax({
        type: 'post',
        url: '/input/save3',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function columnUpd4(id, column) {
    var this_value = $('#' + column + '4' + id).val();
    $ajax({
        type: 'post',
        url: '/input/save4',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function columnUpd5(id, column) {
    var this_value = $('#' + column + '5' + id).val();
    $ajax({
        type: 'post',
        url: '/input/save5',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function columnUpd6(id, column) {
    var this_value = $('#' + column + '6' + id).val();
    $ajax({
        type: 'post',
        url: '/input/save6',
        data: {
            value: this_value,
            column: column,
            id: id,
        },
    }, true, '', function (res) {
        if (res.code == 200) {
            var obj = "";
            if (res.msg == '修改成功') {
                obj = document.getElementById("upd_1");
            } else {
                obj = document.getElementById("upd_2");
            }
            obj.hidden = false;
            setTimeout(function () {
                obj.hidden = true
            }, 3000);
        }
    })
}

function checkNumber(num) {
    if (isNaN(num)) {
        return 0;
    } else {
        return parseFloat(num.toFixed(2));
    }
}