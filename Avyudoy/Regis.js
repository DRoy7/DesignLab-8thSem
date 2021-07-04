
function Inputdata() {
    
    // let hosp = document.getElementById("Hospitals").value;
    // localStorage.setItem("Hospitals", hosp);
     
    let fname = document.getElementById("fname").value;
    localStorage.setItem("fname", fname);

    let mname = document.getElementById("mname").value;
    localStorage.setItem("mname", mname);
    
    let lname = document.getElementById("lname").value;
    localStorage.setItem("lname", lname);

    // Gender Select
    let gend = "";
    if(document.getElementById("gend-male").checked){
        gend = "Male";
    }
    else if(document.getElementById("gend-female").checked){
        gend = "Female";
    }
    else{
        gend = "Other";
    }
    localStorage.setItem("gend", gend);

    
    let age = document.getElementById("age").value;
    localStorage.setItem('age', age);

    let dob = document.getElementById("birthday").value;
    localStorage.setItem("dob", dob);

/*
    let marstat = "";
    if(document.getElementById("single").checked){
        marstat = "Single";
    }
    else if(document.getElementById("marry").checked){
        marstat = "Married";
    }
    else if(document.getElementById("divorce").checked){
        marstat = "Divorced";
    }
    else if(document.getElementById("widow").checked){
        marstat = "Widowed";
    }
    else{
        marstat = "Legally Separated";
    }
    localStorage.setItem("marstat", marstat);
*/

    let addr1 = document.getElementById("Addrs1").value;
    localStorage.setItem("addr1", addr1);

    let city = document.getElementById("City").value;
    localStorage.setItem("city", city);
    
    let pin = document.getElementById("Pin").value;
    localStorage.setItem("pin", pin);
    
    //let state = document.getElementById("state").value;
    //localStorage.setItem("state", state);

    let mob1 = document.getElementById("Mobile1").value;
    localStorage.setItem("mob1", mob1);

    let mail = document.getElementById("mail").value;
    localStorage.setItem("mail", mail);
    
    let ffname = document.getElementById("Ffname").value;
    localStorage.setItem("ffname", ffname);
    
    let flname = document.getElementById("Flname").value;
    localStorage.setItem("flname", flname);
    
    // let rela = document.getElementById("Relation").value;
    // localStorage.setItem("fname", fname);
    
    let mob2 = document.getElementById("Mobile2").value;
    localStorage.setItem("mob2", mob2);


    let covidrep = "";
    if(document.getElementById("rep-pos").checked){
        covidrep = "Positive";
    }
    localStorage.setItem("covidrep", covidrep);



    let bol = document.getElementById("spO2").value;
    localStorage.setItem("bol", bol);

    // let omp1 = document.getElementById("Diseases1").value;
    // let omp2 = document.getElementById("Diseases2").value;
    let osymp = document.getElementById("Comment").value;
    localStorage.setItem("osymp", osymp);
    
    
    
    location.replace("ApplForm_output.html");
}

function Outputdata(){
    // util
    //output page
    fname = localStorage.getItem("fname");
    document.getElementById("fname").innerText = giveSpace("First Name :") + fname;

    mname = localStorage.getItem("mname");
    document.getElementById("mname").innerText = giveSpace("Middle Name :") + mname;

    lname = localStorage.getItem("lname");
    document.getElementById("lname").innerText = giveSpace("Last Namee :") + lname;

    gend = localStorage.getItem("gend");
    document.getElementById("Gender").innerText = giveSpace("Gender:") + gend;

    age = localStorage.getItem("age");
    document.getElementById("Age").innerText = giveSpace("A") + age;

    dob = localStorage.getItem("dob");
    document.getElementById("DOB").innerText = giveSpace("DoB:") + dob;

    marstat = localStorage.getItem("marstat");
    document.getElementById("marstat").innerText = giveSpace("Marital Status : ") + marstat;

    
    addr1 = localStorage.getItem("addr1");
    document.getElementById("Addr1").innerText = giveSpace("Address:") + addr1;

    city = localStorage.getItem("city");
    document.getElementById("City").innerText = giveSpace("C") + city;

    pin = localStorage.getItem("pin");
    document.getElementById("Pin").innerText = giveSpace("") + pin;
    
    //state = localStorage.getItem("state");
    //document.getElementById("State").innerText = giveSpace("State:") + state;


    mob1 = localStorage.getItem("mob1");
    document.getElementById("Mob1").innerText = giveSpace("Mobile(Home Home):") + mob1;

    mail = localStorage.getItem("mail");
    document.getElementById("Mail").innerText = giveSpace("mail") + mail;

    ffname = localStorage.getItem("ffname");
    document.getElementById("ffname").innerText = giveSpace("Familyy Member Nameeee Nameeee:") + ffname;

    flname = localStorage.getItem("flname");
    document.getElementById("flname").innerText = flname;

    mob2 = localStorage.getItem("mob2");
    document.getElementById("Mob2").innerText = giveSpace("Mobile:") + mob2;



    covidrep = localStorage.getItem("covidrep");
    document.getElementById("CovidRep").innerText = giveSpace("RT-PCR Covid Report:") + covidrep;



    bol = localStorage.getItem("bol");
    document.getElementById("Bol").innerText = giveSpace("Blood Oxygen Level: ") + bol;


    
    osymp = localStorage.getItem("osymp");
    document.getElementById("Comments").innerText = giveSpace("Any Symptoms/Comments:") + osymp;

}

function giveSpace(str, val=50){
    return spaces(val - str.length);
}

function spaces(n=4){
    let space = "";
    for(let i=0; i<n; i++){
        space+="\xa0";
    }
    return space;
}