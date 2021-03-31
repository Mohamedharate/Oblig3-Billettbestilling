(function () {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function (form) {
            form.addEventListener('submit', function (event) {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }

                form.classList.add('was-validated')
            }, false)
        })
})()


function regBillett(){

    const fornavn = $("#inpFornavn");
    const etternavn = $("#inpEtternavn");
    const film = $("#film");
    const telefonnr = $("#inpTelefonnr");
    const mail = $("#inpEpost");
    const antall = $("#inpAntall");

    let feil = false;

    if (fornavn.val() === ""){
        feil = true;
    }
    if(etternavn.val() === ""){
        feil = true;
    }
    if (telefonnr.val() === ""){
        feil = true;
    }
    if (mail.val() === ""){
        feil = true;
    }
    if (antall.val() === "" || antall.val() <= 0){
        feil = true;
    }

    if (!feil){
        const billett = {
            fornavn : fornavn.val(),
            etternavn : etternavn.val(),
            film: film.val(),
            telefonnr : telefonnr.val(),
            mail : mail.val(),
            antall : antall.val()
        }

        $.post("/lagre",billett, function() {
            hentAlle();
        });
    }

    film.val("");
    antall.val("");
    fornavn.val("");
    etternavn.val("");
    telefonnr.val("");
    mail.val("");
}

function slettBilletter(){
    $.get("/slettAlle", function (){
        hentAlle();
    });
}

function formaterData(billetter){

    let ut = "\n<table class='table table-striped table-bordered'><tr><th>Film</th><th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefonnummer</th><th>Epost</th></tr>";
    for (const billett of billetter){
        ut += "<tr><td>"+billett.film+"</td><td>"+billett.antall+"</td><td>"+billett.fornavn+"</td><td>"+billett.etternavn+"</td>" +
            "<td>"+billett.telefonnr+"</td><td>"+billett.mail+"</td></tr>";
    }
    ut += "</table>"

    $("#billettene").html(ut);
}

function hentAlle(){
    $.get("/hentAlle", function (data){
        formaterData(data);
    });
}