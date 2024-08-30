<?php
$username = 
$_POST['username'] ?? '';
$senha =
$_POST['senha'] ?? '';

if ($username === 'admin' &&
$senha === 'admin123') {
    echo "Login com sucesso seu lindo Santista!";
} else {
    echo "Usuário ou senha incorretos seu Corintiano nojento!";
}