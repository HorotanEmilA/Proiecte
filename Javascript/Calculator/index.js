const display = document.getElementById("display");

function appendToDisplay(input){
    display.value += input; //displays the number we click 
}

function clearDisplay(){
    display.value = ""; //clears the display
}

function calculate(){
    try{
        display.value = eval(display.value); 
        //uses the eval function to calculate the input and then displays it if no error is encountered
    }
    catch(error){
        display.value = "Error";
    }
}