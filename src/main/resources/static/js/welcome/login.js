/**
 * Created by 张东旭 on 2018.6.16.
 */
define(["jquery","json","css!../../css/bootstrap/bootstrap.min.css","css!../../css/mi/mi.css"],function () {


    $("#login_Btn").click(function () {
       var identifier = $("#InputAdministrator").val();
       var credential = $("#InputPassword").val();

       var input = {
           "identifier":"identifier",
           "credential":"credential"
       }//object类型

       var inputArray = JSON.stringify(input);//string类型

        $.ajax({
            url:"../../../../user/login",//String类型的参数，（默认为当前页地址）发送请求的地址.
            type:"post",//String类型的参数,请求方式（post或get）默认为get.
            async:true,
            cache:false,//Boolean类型的参数，默认为true.
            contentType:'application/json; charset=utf-8',
            data:inputArray,
            dataType:"json",
            success: function(data){

            },
            error: function (data) {

            }
        });


    });



    $(document).ready(function () {

    });

    return null;
});