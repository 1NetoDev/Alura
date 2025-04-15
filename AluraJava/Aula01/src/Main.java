public class Main {
    public static void main(String[] args) {
        Perfil.main(args);
        Estudos.main(args);
        Soma.main(args);
        Subtracao.main(args);
    }
}

class Perfil {
    public static void main(String[] args) {
        System.out.println("Olá, meu nome é Neto");
        System.out.println("Tudo bem?");
    }
}

class Estudos {
    public static void main(String[] args) {
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa");
    }
}

class Soma {
    public static void main(String[] args) {
        System.out.println(10 + 5);
    }
}

class Subtracao {
    public static void main(String[] args) {
        System.out.println(10 - 5);
    }
}
