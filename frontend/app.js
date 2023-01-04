async function load_page(){
    let cl = await fetch("http://localhost:8888/getColor");
    let colorJson = await cl.json();
    console.log(colorJson.color);
    let color = colorJson.color;
    document.getElementById("body").style = "background-color: " + color + ";";
    document.getElementById("title").innerHTML = color;
}