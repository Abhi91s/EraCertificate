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