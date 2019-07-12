<html>
	<head>
		<title>Editar registro de usuário</title>
		<meta charset='utf-8'/>

  
	</head>

	<body>
<?php


    include('conexao.php');

    $cod = $_GET['id'];
    echo $cod;

   echo "<b>Editando o aluno de código ".$cod."</b></br></br>";

    $query ="SELECT * FROM aluno WHERE cod_aluno = $cod";
    
    $result = mysqli_query($con,$query);
 

    if ($result->num_rows > 0) {
        echo "<form method='post' action='editar_aluno_conf.php'>";
        while($linha = $result->fetch_assoc()) {

        	echo "<label>Nome do aluno:</label><input type='text' name='nome_aluno' value='".$linha["nome_aluno"]."'></input><br>";
        	echo "<label>Sobrenome do aluno:</label><input type='text' name='sobrenome_aluno' value='".$linha["sobrenome_aluno"]."'></input><br>";
        	
        	echo "<label>Código do aluno:</label><input type='text' name='cod_aluno' readonly='readonly' value='".$linha["cod_aluno"]."'></input><br>";
        	echo "<input type='submit' value='salvar'></input>";

        }
            echo "</form>";
    } else {
        echo "<b class='erro'>Sem resultados para mostrar</b><br><br>";
    }




?>


</body>
</html>
