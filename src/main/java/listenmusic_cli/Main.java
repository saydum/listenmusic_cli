package listenmusic_cli;

import listenmusic_cli.cmd.ParserCmd;

public class Main {
    public static void main(String[] args) {
        new ParserCmd(args).parser();
    }
}
