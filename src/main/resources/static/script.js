document.getElementById('studentForm').addEventListener('submit', function(e) {
    e.preventDefault();

    let studentName = document.getElementById('studentName').value;
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;
    let qualification = document.getElementById('qualification').value;

    let studentDto = {
        studentName: studentName,
        email: email,
        password: password,
        qualification: qualification
    };

    fetch('http://localhost:8080/student', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(studentDto)
    })
    .then(response => response.json())
    .then(data => {
        alert('Student saved successfully');
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Error saving student');
    });
});
