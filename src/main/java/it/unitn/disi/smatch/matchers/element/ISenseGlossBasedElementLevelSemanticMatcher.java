package it.unitn.disi.smatch.matchers.element;

import it.unitn.disi.smatch.data.ling.ISense;

/**
 * An interface for sense and gloss based element level matchers.
 *
 * @author Mikalai Yatskevich mikalai.yatskevich@comlab.ox.ac.uk
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface ISenseGlossBasedElementLevelSemanticMatcher {

    /**
     * Returns a relation between source and target synsets.
     *
     * @param source interface of source synset
     * @param target interface of target synset.
     * @return a relation between source and target synsets
     * @throws ElementMatcherException ElementMatcherException
     */
    char match(ISense source, ISense target) throws ElementMatcherException;
}