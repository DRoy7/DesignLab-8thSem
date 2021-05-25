var codes = []

function getPage(){
    // getting state code name
    var statecode = document.getElementById("stateName").value.toLowerCase();
    // creating the link for iframe
    var link = `https://www.covid19india.org/state/${statecode}`;
    // check codes if valid or not
    //var flag = false;
    //console.log("hii");
    //flag = getCodes();
    // getting the result in iframe
    //if(flag) 
        document.getElementById("covidmap").src = link;
    // for not reloading the page
    return false;
}

function getCodes(){
    var table = document.getElementById("codeTable");
    for(var i=0; i<table.rows.length; i++){
        console.log(i)
        console.log(table.rows[i]);
    }
    return false;
}