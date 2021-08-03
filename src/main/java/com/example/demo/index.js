
fetch("https://localhost:8080/users/")
    .then(res => res.json())
    .then(data => console.log(data))

