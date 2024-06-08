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
    showForm(individual_course_form);
});

full_stack_button.addEventListener("click", () => {
    showForm(full_stack_form);
});

computer_basic_button.addEventListener("click", () => {
    showForm(computer_basic_form);
});

closeForm.addEventListener("click", () => {
    forms.classList.remove("active");
    [individual_course_form, full_stack_form, computer_basic_form].forEach(form => {
        form.classList.remove("active");
    });
    console.log("closed");
})