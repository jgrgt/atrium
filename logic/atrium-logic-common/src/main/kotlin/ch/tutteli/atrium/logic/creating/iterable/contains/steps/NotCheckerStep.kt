package ch.tutteli.atrium.logic.creating.iterable.contains.steps

import ch.tutteli.atrium.logic.creating.iterable.contains.IterableLikeContains
import ch.tutteli.atrium.logic.creating.typeutils.IterableLike

/**
 * Represents the extension point for another step after a `contains not at all`-check within
 * a sophisticated `contains` assertion building process for [Iterable].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied for the input of the search.
 */
interface NotCheckerStep<E, T : IterableLike, out S : IterableLikeContains.SearchBehaviour>
    : IterableLikeContains.CheckerStep<E, T, S>
