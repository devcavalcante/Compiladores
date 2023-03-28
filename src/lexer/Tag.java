package lexer;

public enum Tag {
    ASSIGN("ASSIGN"),
    SUM("SUM"), MUL("MUL"), SUB("SUB"),
    OR("OR"),
    LT("LT"), LE("LE"), GT("GT"),
    LIT_INT("LIT_INT"),
    EOF("EOF"), UNK("UNK");

    private String name;

    private Tag(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}