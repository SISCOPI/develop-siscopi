
$(function () {
    $('a[href="#masPr"]').click(function () {
        event.preventDefault();
        $("#masinfpropuesta").dialog("open");

    });


    //dialogos
    $("#masinfpropuesta").dialog({
        autoOpen: false,
        width: 'auto', // overcomes width:'auto' and maxWidth bug
        maxWidth: 1200,
        height: 'auto',
        maxHeight: 600,
        modal: true,
        fluid: true, //new option
        resizable: false,

        buttons: [
            {
                text: "Aceptar",
                click: function () {
                    $(this).dialog("close");
                }
            }
        ]
    });
//    $("#confirmaAltaPropuesta").dialog({
//        autoOpen: false,
//        width: 'auto', // overcomes width:'auto' and maxWidth bug
//        maxWidth: 1200,
//        height: 'auto',
//        maxHeight: 600,
//        modal: true,
//        fluid: true, //new option
//        resizable: false,
//
//        buttons: [
//            {
//                text: 'Cancelar',
//                click: function () {
//                    $(this).dialog('close');
//                },
//                class: 'button-acepta'
//            },
//            {
//                text: 'Aceptar',
//                click: function () {
//                    $(this).dialog('close');
//                },
//                class: 'button-acepta'
//            }
//        ]
//    });
    //datatables
    $('#tpropuestas').DataTable({
        "pagingType": "full_numbers",
        responsive: true,

        "language": {
            "sProcessing": "Procesando...",
            "sLengthMenu": "Mostrar _MENU_ registros",
            "sZeroRecords": "No se encontraron resultados",
            "sEmptyTable": "Ningún dato disponible en esta tabla",
            "sInfo": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_",
            "sInfoEmpty": "Mostrando registros del 0 al 0 de un total de 0",
            "sInfoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sInfoPostFix": "",
            "sSearch": "Buscar:",
            "sUrl": "",
            "sInfoThousands": ",",
            "sLoadingRecords": "Cargando...",
            "oPaginate": {
                "sFirst": "Primero",
                "sLast": "Último",
                "sNext": "Siguiente",
                "sPrevious": "Anterior"
            },
            "oAria": {
                "sSortAscending": ": Activar para ordenar la columna de manera ascendente",
                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
            }
        }
    });


});

function presentaResumen() {
    event.preventDefault();
   // $("#confirmaAltaPropuesta").dialog("open");
    $("#resumen").show();
    $("#principal").hide();
}
function confirmaResumen() {
    event.preventDefault();
    $("#confirmaAltaPropuesta").dialog("open");

}
function ocultaResumen() {
    event.preventDefault();
   // $("#confirmaAltaPropuesta").dialog("open");
    $("#resumen").hide();
    $("#principal").show();
}