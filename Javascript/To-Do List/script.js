const inputBox=document.getElementById("input-box");
const listContainer=document.getElementById("list-container");

function addTask(){
    if(inputBox.value === ''){
        alert("You must write something!");
        //alerts if the field is empty
    }
    else{
        let li= document.createElement("li");
        li.innerHTML=inputBox.value; 
        listContainer.appendChild(li);
        //adds the text to the list
        let span=document.createElement("span");
        span.innerHTML="\u00d7";
        li.appendChild(span);
        //creates the "delete" button for the element added
    }
    inputBox.value=""; //resets the input box to be clear
    saveData(); //saves the list after every insert
}

listContainer.addEventListener("click",function(e){
    if(e.target.tagName === "LI"){
        e.target.classList.toggle("checked"); //toggles the element to be checked or unchecked when clicked in the list
    }
    else if(e.target.tagName === "SPAN"){
        e.target.parentElement.remove();  //deletes the element when "x" is pressed
    }
},false);

function saveData(){
    localStorage.setItem("data", listContainer.innerHTML);
    //saves the list on local storage 
}

function showTask(){
    listContainer.innerHTML=localStorage.getItem("data");
}
showTask(); //initializes the list with the data previosuly stored
