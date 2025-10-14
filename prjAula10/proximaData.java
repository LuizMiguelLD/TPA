package prjAula13;

import java.util.Scanner;

public class proximaData {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia, mes, ano, i;

		do {
			System.out.println("Digite o dia: ");
			dia = leia.nextInt();

			System.out.println("Digite o mês: ");
			mes = leia.nextInt();

			System.out.println("Digite o ano: ");
			ano = leia.nextInt();
			
			if (dia>31 && mes>12){
				System.out.println("Dia e mês inválido");
			}else if(dia<=31 && mes>12) {
				System.out.println("Mês inválido");
			}else if(mes<=12 && dia>31){
				System.out.println("Dia inválido");
			}else {
				
			if (ano % 4 == 0) {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					if (dia < 31) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 31) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					break;
				case 12:
					if (dia < 31) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 31) {
						ano = ano+1;
						mes = 1;
						dia = 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					
					
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia < 30) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 30) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					
						break;
						
				case 2:
					if (dia < 29) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 29) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}else {
						System.out.println("Dia inválido");
					}
					
			
					
				}
		
			}else {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					if (dia < 31) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 31) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					break;
				case 12:
					if (dia < 31) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 31) {
						ano = ano+1;
						mes = 1;
						dia = 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					
					
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia < 30) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 30) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}
					
						break;
						
				case 2:
					if (dia < 28) {
						dia = dia + 1;
						if(dia<10) {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/"+ mes + "/" + ano);
							}
						}else {
							if(mes<10) {
								System.out.println(dia + "/" + mes + "/" + ano);								
							}else {
								System.out.println(dia + "/" + mes + "/" + ano);
							}
						}
					} else if (dia == 28) {
						dia = 1;
						mes = mes + 1;
						System.out.println(dia + "/" + mes + "/" + ano);
					}else {
						System.out.println("Dia inválido");
					}
					
			
					
				}
			}
			
			}
					
			System.out.println("Deseja continuar? 1-Sim 2-Não");
			i = leia.nextInt();
			
		} while (i == 1);
		

	}

}
