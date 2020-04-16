function test(){
    console.log("success")
}

function loadJson(){
    document.getElementById('iframe_id').setAttribute("src", "http://localhost:8080/GetWeather");

    $.ajax({
        url:'http://localhost:8080/GetWeather',
        type:'GET',
        data:''
    })
    // Ajaxリクエストが成功した時発動
    .done( (data) => {
        $("#p_id").text(JSON.stringify(data));
        console.log(data);
    })
    // Ajaxリクエストが失敗した時発動
    .fail( (data) => {
        // $('.result').html(data);
        console.log(data);
    })
    // Ajaxリクエストが成功・失敗どちらでも発動
    .always( (data) => {
        console.log("リクエスト終了");
    });
}
