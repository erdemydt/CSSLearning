// Get all elements with the "clickable" class

const clickableElements = floating.html.getElementsByClassName(".clickable")

// Add a click event listener to each element
clickableElements.forEach((element) => {
  element.addEventListener('click', () => {
    // Handle the click event
    alert('Element clicked!');
  });
});
function lol(){
    alert("lol");
}
