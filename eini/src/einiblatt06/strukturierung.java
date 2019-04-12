package einiblatt06;

public class strukturierung {
public static void main(String[] args) 
	{
	double 	fh=16.5, fw=27.5, fd=38.0,
			sh=20.0, sw=20.0, sd=20.0,
			th=40.2, tw=22.5, td=18.5;
	double Vol;
	if((fh*fw*fd>=sh*sw*sd) && (fh*fw*fd>=th*tw*td)) 
		{
		Vol=fh*fw*fd;
		System.out.println("Quader 1 hat das größte Volumen " + Vol);
		}
	else if((sh*sw*sd>=fh*fw*fd) && (sh*sw*sd>=th*tw*td)) 
		{
		Vol=sh*sw*sd;
		System.out.println("Quader 2 hat das größte Volumen " + Vol);
		}
	else 
		{
		Vol=th*tw*td;
		System.out.println("Quader 3 hat das größte Volumen " + Vol);
		}
	}
}
