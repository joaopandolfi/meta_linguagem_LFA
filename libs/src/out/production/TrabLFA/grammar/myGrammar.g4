grammar myGrammar;

@header {
import com.company.data.*;
}

init returns [Code result]
    :p = prog {$result = $p.result;};

prog returns [Code result]
        : 'INICIAR' b=logica 'FIM_DO_PROGRAMA' { $result = Body.mkBody($b.result);};

logica returns [Code result]
       : cd=condicao {$result = $cd.result;}
       | l=laco      {$result = $l.result;}
       | co=comando  {$result = $co.result;}
       //| BREAK (t0 = logica {$result = Logica.concatLogica($result,$t0.result);})*
       | t1=logica t2=logica {$result = Logica.concatLogica($t1.result,$t2.result);}
       ;

condicao returns [Code result]
         : 'SE_(' v0 = verificacao ')_FOR_VERDADE:' l0 = logica 'FIM_DO_SE' {$result = Condicao.mkCondicao(0,$v0.result,$l0.result);}
         | 'SE_(' v1 = verificacao ')_FOR_FALSO:' l1 = logica 'FIM_DO_SE' {$result = Condicao.mkCondicao(1,$v1.result,$l1.result);}
         | 'SENAO:' l2 = logica 'FIM_DO_SENAO' {$result = Condicao.mkCondicao($l2.result);}
         ;

laco returns [Code result]
     : 'ENQUANTO_(' v = verificacao ')_FOR_VERDADE:'l0 = logica 'FIM_DO_ENQUANTO' {$result = Laco.mkEnquanto($v.result,$l0.result);}
     | 'REPITA_(' NUMERO ')_VEZES:' l1 = logica 'FIM_DO_REPITA' {$result = Laco.mkFor($NUMERO.text,$l1.result);}
     ;

verificacao returns [Code result]
            : 'NAO_EXISTE_NADA_A_FRENTE'            {$result = Verificacao.mkVerif("NAO_EXISTE_NADA_A_FRENTE");}
            | 'EXISTE_OBJETO_A_DIREITA'             {$result = Verificacao.mkVerif("EXISTE_OBJETO_A_DIREITA");}
            | 'EXISTE_OBJETO_A_ESQUERDA'            {$result = Verificacao.mkVerif("EXISTE_OBJETO_A_ESQUERDA");}
            | 'SENSOR_LINHA_DIREITA_RECONHECEU'     {$result = Verificacao.mkVerif("SENSOR_LINHA_DIREITA_RECONHECEU");}
            | 'SENSOR_LINHA_MEIO_RECONHECEU'        {$result = Verificacao.mkVerif("SENSOR_LINHA_MEIO_RECONHECEU");}
            | 'SENSOR_LINHA_ESQUERDA_RECONHECEU'    {$result = Verificacao.mkVerif("SENSOR_LINHA_ESQUERDA_RECONHECEU");}
            | 'AGARROU_OBJETO'                      {$result = Verificacao.mkVerif("AGARROU_OBJETO");}
            | 'ESTA_PARADO'                         {$result = Verificacao.mkVerif("ESTA_PARADO");}
            | 'ESTA_ANDANDO'                        {$result = Verificacao.mkVerif("ESTA_ANDANDO");}
            | 'CHEGOU_NO_OBJETIVO'                  {$result = Verificacao.mkVerif("CHEGOU_NO_OBJETIVO");}
            | 'VERDADEIRO'                          {$result = Verificacao.mkVerif("VERDADEIRO");}
            | 'FALSO'                               {$result = Verificacao.mkVerif("FALSO");}
            | negacao v = verificacao               {$result = Verificacao.mkNotVerif($v.result);}
            ;

comando returns [Code result]
        : 'VIRAR_PARA_DIREITA'                              {$result = Comando.mkComando("VIRAR_PARA_DIREITA");}
        | 'VIRAR_PARA_ESQUERDA'                             {$result = Comando.mkComando("VIRAR_PARA_ESQUERDA");}
        | 'ANDAR_PARA_FRENTE'                               {$result = Comando.mkComando("ANDAR_PARA_FRENTE");}
        | 'PARAR'                                           {$result = Comando.mkComando("PARAR");}
        | 'ANDAR_PARA_FRENTE_POR_(' NUMERO ')_SEGUNDOS'     {$result = Comando.mkComandoParam($NUMERO.text,0);}
        | 'ABRIR_GARRA'                                     {$result = Comando.mkComando("ABRIR_GARRA");}
        | 'ABRIR_GARRA_(' NUMERO ')_GRAUS'                  {$result = Comando.mkComandoParam($NUMERO.text,1);}
        | 'FECHAR_GARRA'                                    {$result = Comando.mkComando("FECHAR_GARRA");}
        | 'LIGAR_MOTOR_DIREITA'                             {$result = Comando.mkComando("LIGAR_MOTOR_DIREITA");}
        | 'LIGAR_MOTOR_ESQUERDA'                            {$result = Comando.mkComando("LIGAR_MOTOR_ESQUERDA");}
        | 'DESLIGAR_MOTOR_ESQUERDA'                         {$result = Comando.mkComando("DESLIGAR_MOTOR_ESQUERDA");}
        | 'DESLIGAR_MOTOR_DIREITA'                          {$result = Comando.mkComando("DESLIGAR_MOTOR_DIREITA");}
        ;

negacao : 'NAO_'
        | 'E_FALSO_QUE'
        | 'O_CONTRARIO_DE_'
        ;

WS      : [ \t\r\n]+ -> skip
        ;

NUM : [0-9];
NUMERO : NUM+;
NULL : ' ';