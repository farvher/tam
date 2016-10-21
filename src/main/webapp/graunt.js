
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @autor farsan@eltiempo.com
 * 
 */
 var reports = [
    "metrocuadrado-clicklogoconstructoraproyecto",
            "metrocuadrado-clicklogoinmobiliariadetalle",
            "metrocuadrado-contactarporemailinmobiliariainmuebledetalle",
            "metrocuadrado-contactarporemailinmobiliariainmuebleorigendetalle",
            "metrocuadrado-contactarportelefonoinmobiliariainmuebledetalle",
            "metrocuadrado-contactociudadproyecto",
            "metrocuadrado-contactoconstructor",
            "metrocuadrado-contactoinmuebletipociudadproyecto",
            "metrocuadrado-detallevertelefonociudadproyecto",
            "metrocuadrado-detallevertelefonoinmuebletipociudadproyecto",
            "metrocuadrado-detallevertelefonoinmuebletipoproyecto",
            "metrocuadrado-detallevertelefonoproyecto",
            "metrocuadrado-proyectocontacto",
            "metrocuadrado-proyectodestacadohomeclick",
            "metrocuadrado-proyectospublicadosciudad",
            "metrocuadrado-proyectospublicadosciudadtipoinmueble",
            "metrocuadrado-proyectospublicadosciudadzona",
            "metrocuadrado-proyectovisita",
            "metrocuadrado-proyectovisitadetalle",
            "metrocuadrado-usadospublicadosinmobiliariaciudad",
            "metrocuadrado-usadospublicadosinmobiliariaciudadtiponegocio",
            "metrocuadrado-usadospublicadosinmobiliariaciudadzona",
            "metrocuadrado-usadospublicadosinmobiliariatiponegocio",
            "metrocuadrado-vertelefonoconstructor",
            "metrocuadrado-vertelefonoinmobiliariaciudaddetalle",
            "metrocuadrado-clicklogobusquedaporinmobiliariaintegral",
            "metrocuadrado-clicklogobusquedaporinmobiliariamodnegocio",
            "metrocuadrado-vertelefonoinmobiliariaciudadzonadetalle",
            "metrocuadrado-vertelefonoinmobiliariadetalle",
            "metrocuadrado-vertelefonoinmobiliariaestratodetalle",
            "metrocuadrado-vertelefonoinmobiliariainmuebledetalle",
            "metrocuadrado-vertelefonoinmobiliariapreciodetalle",
            "metrocuadrado-visitaconstructorproyecto",
            "metrocuadrado-visitaresultadosocasional",
            "metrocuadrado-visitaresultadosproyecto",
            "metrocuadrado-visitasporinmobiliariaciudaddetalle",
            "metrocuadrado-visitasporinmobiliariaciudadtiponegociodetalle",
            "metrocuadrado-visitasporinmobiliariadetalle",
            "metrocuadrado-visitasporinmobiliariainmueble",
            "metrocuadrado-visitasporinmobiliariatiponegociodetalle",
            "metrocuadrado-visitasporinmobiliariausuariounicodetalle",
            "metrocuadrado-visitasporinmobiliariausuariounicoinmueble"
]

 

var ambiente = "metrocuadrado-";
//var ambiente = "metrocuadrado_prueba-";
var urlreport ="http://206.128.154.242/report/"
var contactarporemailinmobiliariainmuebledetalle = "contactarporemailinmobiliariainmuebledetalle";



function getTimeStamp(date) {
    return date.getTime();
}

function getTimeStamp() {
    return new Date().getTime();
}


function recorrer(){
$("#data").html(12)
$.each(reports,function(i,o){
var timeframe = {
timeframe: 'hourly'
}
$("#data").html(urlreport+ambiente+o)
ajaxGraunt(urlreport+ambiente+o,timeframe,null);
})

}




function ajaxGraunt(url, data, func) {
    $.ajax({
        url: url,
        data: data,
        success: function (data) {
        var html = $("#data").html();
        $("#data").html(html+'<br>'+data)
        },
        error: function (a, b, c) {
            alert(a + b + c);

        }

    })
recorrer();
}









