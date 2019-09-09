package wordy.ast;

import java.util.Objects;

import wordy.ast.ASTNode;

public class LoopNode extends StatementNode {
    public final StatementNode body;

    public LoopNode(StatementNode body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        LoopNode loopNode = (LoopNode) o;
        return body.equals(loopNode.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        return "LoopNode{body=" + body + '}';
    }
}