$(document).ready(function (){
    $('#id-button1').click(function (){
        var x=$('#id-fn').val();
        $.ajax({
            url:'Servlet',
            type:'post',
            data:{fn:x},
            dataType:'json',
            success: function (data){
                $('#id-ajaxresponse').text(data.fn);
            }
        })
    })
});