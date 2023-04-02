package lexer;

public enum Tag {
    PROGRAM("PROGRAM"),
    BEGIN("BEGIN"), END("END"),
    INT("INT"), REAL("REAL"),BOOL("BOOL"), 
    TRUE("TRUE"), FALSE("FALSE"),
    READ("READ"), WRITE("WRITE"),
    ASSIGN("ASSIGN"),
    SUM("SUM"), MUL("MUL"), SUB("SUB"),
    OR("OR"),
    LT("LT"), LE("LE"), GT("GT"),
    LIT_INT("LIT_INT"),
    ID("ID"),
    EOF("EOF"), UNK("UNK"),
    LIT_REAL("LIT_REAL");

    private String name;

    private Tag(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}