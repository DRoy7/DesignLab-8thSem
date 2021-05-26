// for validation purpose util function
function getCodes(x){
    console.log("hi");
    // getting the iframe element
    var frameInPage1 = document.getElementById("names");
    // getting the document of the iframe html page
    var page2 = frameInPage1.contentDocument;
    // now in the page2 document searching for id of codeTable
    var table = page2.getElementById("codeTable");
    // array for storing the state codes
    var codes = []
    // getting the column values to prepare codes array
    for(var i=1; i<table.rows.length; i++){
        // getting the column from table
        var cols = table.rows[i].cells;
        // getting the state code
        var code = cols[1].innerText;
        // adding that in the global array
        codes.push(code.toLowerCase());
    }
    // now after filling the array now check if the code is present there or not
    return codes.includes(x);
}

// the called function which will load the covid19org iframe
function getPage(){
    // getting state code name
    var statecode = document.getElementById("stateName").value.toLowerCase();
    // creating the link for iframe
    var link = `https://www.covid19india.org/state/${statecode}`;
    // check codes if valid or not
    var flag = false;
    // for checking if the code is valid or not 
    flag = getCodes(statecode);
    // if valid code
    if(flag){
        // changing the link in iframe for given statecode
        document.getElementById("covidmap").src = link;
    }
    // if not valid
    else{
        // showing an alert message to the user
        alert("Please enter a proper State-code!!!\nHint : Check the list on your left side");
    }
    // for not reloading the page
    return false;
}
