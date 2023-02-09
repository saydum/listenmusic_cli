package listenmusic_cli.cmd;

import org.apache.commons.cli.*;

public class ParserCmd {

    private final String[] args;

    public ParserCmd(String[] args) {
        this.args = args;
    }

    public void parser() {

        Options opt = new Options();

        opt.addOption(
                "s",
                "save",
                false,
                "-s https://example.com/video?example=534245/"
        );

        opt.addOption(
                "l",
                "list",
                false,
                "List"
        );

        opt.addOption(
                "p",
                "play",
                false,
                "Play."
        );

        opt.addOption(
                "d",
                "delete",
                false,
                "Delete."
        );

        opt.addOption(
                "h",
                "help",
                false,
                "Help."
        );

        CommandLineParser commandLineParser = new DefaultParser();
        CommandLine cmd = null;

        try {
            cmd = commandLineParser.parse(opt, args);
        } catch (UnrecognizedOptionException e) {
            System.out.println("Unknown option " + e.getOption());
            usagePrintAndClose(opt, 1);
        } catch (ParseException e) {
            System.out.println("Command line parse error " + e.getMessage());
            usagePrintAndClose(opt, 2);
        }

        if (cmd == null) {
            System.out.println("Command line parse error");
            usagePrintAndClose(opt, 3);
        } else {
            if (cmd.hasOption('h') || args.length == 0) {
                usagePrintAndClose(opt, 0);
            }
        }
    }

    private static void usagePrint(Options opt) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("""
                listnermusic_cli [OPTIONS] \n
                """, opt);
    }

    private static void usagePrintAndClose(Options opt, int status) {
        usagePrint(opt);
        System.exit(status);
    }
}
