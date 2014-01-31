package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;
import acm.program.DialogProgram;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;

/**
 * @author Shilad Sen
 */
public class WikipediaReader extends ConsoleProgram {
    public void run() {
        MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
        String page = this.readLine("Enter page that should be fetched");
        Article article = bot.getArticle(page);
        String contents = article.getText();
        if (contents.length() > 1000) {
            contents = contents.substring(0, 1000);
        }
        println(contents);
    }
}
