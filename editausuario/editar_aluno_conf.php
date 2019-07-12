<html>
	<head>
		<title></title>
		<meta charset='utf-8'/>
	</head>

	<body>
<?php


    include('conexao.php');

    $nome = $_POST['nome_aluno'];
    $sobrenome = $_POST['sobrenome_aluno'];
    $cod = $_POST['cod_aluno'];

    if(($nome=='')or ($sobrenome=='')){
        echo "<font color='red'>Todos os campos devem ser preenchidos.</font><br><br>";
    }else{
    echo "Nome: ".$nome."</br>Sobrenome: ".$sobrenome."</br></br>";

    $adc = "UPDATE aluno SET nome_aluno='$nome', sobrenome_aluno='$sobrenome' WHERE cod_aluno='$cod'"; 

    $ins = mysqli_query($con,$adc);

    if($ins)
    {
    echo "<b style='color:green'>Aluno editado com sucesso!</b> </br><a href='form_consultaluno.php'>Voltar</a>";

    }
    else
    {
    echo "Erro </br><a href='ver.php'>Voltar</a>";

    }
    }
?>
	</body>
</html>