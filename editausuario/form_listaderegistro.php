
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>



<fieldset>
<legend>Lista de aluno</legend>

<table border="1" width="100%">
 <tr>
      <th>Código do aluno</th>
      <th>Nome do aluno</th>
      <th>Sobrenome do aluno</th>
      <th></th>
      <th></th>
 </tr>
 
<?php
    

	if(isset($_POST["consultar"])){
            $nome = $_POST['nome'];
            $sobrenome = $_POST['sobrenome'];
           
            include('conexao.php');
	
            if(($nome == '') and ($sobrenome == '')){
                echo "<font color='red'>Preencha um dos campos para efetuar a consulta.</font><br><br>";
            }else{
                $sqlconsultaluno = "select * from aluno where nome_aluno='$nome' or sobrenome_aluno='$sobrenome'"; 
                $consultaluno = mysqli_query($con,$sqlconsultaluno);
            
            
                $i = 0;
		if (mysqli_num_rows($consultaluno) == 0){
			echo "<h4>Nenhum Registro Encontrado!</h4>";
		}
		else{
		while ($linha = mysqli_fetch_array($consultaluno)) {
		   $cod_aluno = $linha["cod_aluno"];
		   $nome = $linha["nome_aluno"];
		   $sobrenome = $linha["sobrenome_aluno"];
		   	
		   if ($i % 2 == 0){
			  $cor = "#DDDDDD";
		   }
		   else{
			  $cor = "#FFFFFF";
		   }
		
    ?>
		<tr bgcolor="<?php echo $cor; ?>"
                    <td></td>
                    <td><?php echo $cod_aluno; ?></td>
                    <td><?php echo $nome; ?></td>
                    <td><?php echo $sobrenome; ?></td>
                   
                    <td><?php echo "<a href='editar_aluno.php?id=".$linha["cod_aluno"]."'>Editar</a>";?></td>
                    <td><?php echo "<a href='deletar_aluno.php?id=".$linha["cod_aluno"]."'>Deletar</a>";?></td>

		</tr>
		 
		<?php
		   $i++;
                   
		}
	}
            }
        }    
?>
</table>
    </body>
</html>
