(function () {
    var rootPath = getRootPath();
    require.config({
        //requireJs 警惕单例里变量，因为RequireJS在require一次后，之后的require都是使用之前的缓存。
        //在部署到正式环境的时候，将此参数移除。
        urlArgs: "x=" +  (new Date()).getTime(),
        baseUrl: rootPath + "/js",
        paths: {
            jquery: "../../js/plugins/jquery/jquery-3.2.1.min",
            bootstrap: "../../js/plugins/bootstrap/bootstrap.min",
            cookie: "../../js/plugins/jquery/jquery.cookie",
            json: "../../js/plugins/json/json2"

        },
        map: { //加载其他模块前，先加载map
            '*': {
                'css': '../../js/plugins/css/css.min' //css.js 插件 引入css文件依赖
            }
        },
        shim:{//依赖关系定义
            json:{
                deps: ["jquery"],
                exports: 'json'
            },
            bootstrap:{
                deps: ["jquery"],
                exports: 'bootstrap'
            }
        }
    });

    require(['jquery','json','bootstrap','cookie'],function () {
        var m,g = [];
        $("script").each(function () {

            var s1;

            s1 = $(this).attr("data-app");
            if(typeof s1 === "string"){
                s1 = $.trim(s1).split(",");
                for(var j=0,f=s1.length;j<f;j++){
                    m= $.trim(s1[j]);
                    if(m != null){
                        g.push(m);
                    }
                }
            }
        });
        if(g.length > 0){
            require(g);
        }
    });

    requirejs.onError = function (err) {
        console.error(err.requireType + ":",err.message);
        console.error('modules:' + err.requireModules);
        throw err;
    }

    //js获取项目根路径： 如： http://localhost:8080/mi

    function getRootPath() {
        //获取当前网址，如 http://localhost:8080/mi/welcome/index.html
        var curWwwPath = window.document.location.href;
        //获取主机地址之后的目录，如 mi/templates.welcome/index.html
        var pathName = window.document.location.pathname;
        var pos = curWwwPath.indexOf(pathName);
        //获取主机地址，如 http://localhost:8080
        var localhostPath = curWwwPath.substring(0,pos);
        //获取带'/'的项目名，如 /mi
        //var projectName =  pathName.substring(0,pathName.substr(1).indexOf('/') + 1);
        return (localhostPath);

    }


})(this);


