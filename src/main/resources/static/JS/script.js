// Sidebar
let close_icon = document.querySelector(".close")
let menu_icon = document.querySelector(".menu")
let web_header = document.querySelector("#web-header")
let web_main = document.querySelector("#web-main")

close_icon.addEventListener("click", () => {
    web_header.classList.add("active")
    web_main.classList.add("active")
})

menu_icon.addEventListener("click", () => {
    web_header.classList.remove("active")
    web_main.classList.remove("active")
})

// Services Form
let forms = document.querySelector("#forms");
let closeForm = document.querySelector("#closeForm");

let individual_course_form = document.querySelector("#individual-course-form");
let individual_course_button = document.querySelector("#individual-course-button");

let full_stack_form = document.querySelector("#full-stack-form");
let full_stack_button = document.querySelector("#full-stack-button");

let computer_basic_form = document.querySelector("#computer-basic-form");
let computer_basic_button = document.querySelector("#computer-basic-button");

// Function to show a form and hide others
function showForm(formToShow) {
    // Hide all forms
    [individual_course_form, full_stack_form, computer_basic_form].forEach(form => {
        form.classList.remove("active");
    });

    // Show the selected form
    formToShow.classList.add("active");

    // Add the active class to the forms container
    forms.classList.add("active");
}

individual_course_button.addEventListener("click", () => {
    console.log("Clicked");
    showForm(individual_course_form);
});

full_stack_button.addEventListener("click", () => {
    console.log("Clicked");
    showForm(full_stack_form);
});

computer_basic_button.addEventListener("click", () => {
    console.log("Clicked");
    showForm(computer_basic_form);
});

function hideForm() {
    forms.classList.remove("active");
    [individual_course_form, full_stack_form, computer_basic_form].forEach(form => {
        form.classList.remove("active");
    });
    console.log("closed");
}

closeForm.addEventListener("click", hideForm())
document.querySelector("#close-form-space").addEventListener("click", function () {
    hideForm()
}) 
