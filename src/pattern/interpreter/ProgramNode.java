package pattern.interpreter;

public class ProgramNode extends Node {

    private Node comandListNode;


    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        comandListNode = new CommandListNode();
        comandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + comandListNode + "]";
    }
}
