# Meta Linguagem
Meta linguagem desenvolvida para facilitar crianças a programar em Arduino. 
 > Feita usando a ferramta ANTLR

Esta linguagem tem como intuito abstrair o conceito de programação.

~~Sim parece irônico uma linguagem abstrair o conceito de programar~~

Os comandos são em português e tem como finalidade serem intuitivos.

EX:

INICIAR

	ENQUANTO_(NAO_CHEGOU_NO_OBJETIVO)_FOR_VERDADE:

		SE_(NAO_EXISTE_NADA_A_FRENTE)_FOR_VERDADE:

			ANDAR_PARA_FRENTE

		FIM_DO_SE

		SENAO:

			PARAR

			SE_(EXISTE_OBJETO_A_DIREITA)_FOR_VERDADE:

				VIRAR_PARA_ESQUERDA

			FIM_DO_SE

			SENAO:

				VIRAR_PARA_DIREITA

			FIM_DO_SENAO

		FIM_DO_SENAO

	FIM_DO_ENQUANTO

FIM_DO_PROGRAMA

#Saida
 > É gerado um arquivo ino.ino na pasta /ino dentro do projeto.

#Executar pelo terminal
 > navegar ate a pasta pelo cmd
 > executar: run.bat arquivo
 > EX: run.bat codigo.txt