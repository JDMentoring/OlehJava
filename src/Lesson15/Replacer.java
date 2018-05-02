package Lesson15;

public class Replacer {
    Inputer input;
    Outputer output;

    public Replacer(Inputer input, Outputer output) {
        this.input = input;
        this.output = output;
    }
    public Replacer() {
        this.input = null;
        this.output = null;
    }
    public void replace(){
        input.showType();
        String line = input.getData();
        line = line.replace("w","z");
        output.showData(line);
    }


    public void setInput(Inputer input) {
        this.input = input;
    }

    public void setOutput(Outputer output) {
        this.output = output;
    }
}
