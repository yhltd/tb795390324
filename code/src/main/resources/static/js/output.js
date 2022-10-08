var list1={};
var list2={};
var list3={};
var list4={};
var list5={};

function getList() {
    list1={
        ride:'ride1',
        EnergytotalKj:"",
        OverCPenergyKJ:""
    };

    list2={
        ride:'ride2',
        EnergytotalKj:"",
        OverCPenergyKJ:"",
    };

    list3={
        ride:'ride3',
        EnergytotalKj:"",
        OverCPenergyKJ:"",
    };
    list4={
        ride:'ride4',
        EnergytotalKj:"",
        OverCPenergyKJ:"",
    };
    list5={
        ride:'ride5',
        EnergytotalKj:"",
        OverCPenergyKJ:"",
    };

    $ajax({
        type: 'post',
        url: '/input/getList7',
        async: true,
    }, false, '', function (res) {
        if (res.code == 200) {
            for(var i=34;i<39;i++){
                if(i==34){
                    list1.EnergytotalKj=res.data[i].ak;
                    list1.OverCPenergyKJ=res.data[i].al;
                }else if(i==35){
                    list2.EnergytotalKj=res.data[i].ak;
                    list2.OverCPenergyKJ=res.data[i].al;
                }else if(i==36){
                    list3.EnergytotalKj=res.data[i].ak;
                    list3.OverCPenergyKJ=res.data[i].al;
                }else if(i==37){
                    list4.EnergytotalKj=res.data[i].ak;
                    list4.OverCPenergyKJ=res.data[i].al;
                }else if(i==38){
                    list5.EnergytotalKj=res.data[i].ak;
                    list5.OverCPenergyKJ=res.data[i].al;
                }
            }

            var myChart = echarts.init(document.getElementById('chart1'));
            var option = {
                legend: {},
                tooltip: {},
                dataset: {
                    dimensions: ['ride', 'EnergytotalKj', 'OverCPenergyKJ'],
                    source: [
                        list1,
                        list2,
                        list3,
                        list4,
                        list5,
                    ]
                },
                xAxis: { type: 'category' },
                yAxis: {},
                // Declare several bar series, each will be mapped
                // to a column of dataset.source by default.
                series: [{ type: 'bar' }, { type: 'bar' }]
            };
            myChart.setOption(option);
        }
    });


}

$(function () {
    getList();
});
