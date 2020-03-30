/*
 * generated by Xtext 2.12.0
 */
package fi.tucs.entities.parser.antlr;

import com.google.inject.Inject;
import fi.tucs.entities.parser.antlr.internal.InternalEntitiesParser;
import fi.tucs.entities.services.EntitiesGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EntitiesParser extends AbstractAntlrParser {

	@Inject
	private EntitiesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEntitiesParser createParser(XtextTokenStream stream) {
		return new InternalEntitiesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public EntitiesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
