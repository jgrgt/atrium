//TODO remove file with 1.0.0
@file:Suppress("DEPRECATION")
package ch.tutteli.atrium.domain.robstoll.lib.creating

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.assertions.builders.assertionBuilder
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.creating.SubjectProvider
import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains
import ch.tutteli.atrium.domain.creating.charsequence.contains.searchbehaviours.NoOpSearchBehaviour
import ch.tutteli.atrium.domain.creating.charsequence.contains.searchbehaviours.NotSearchBehaviour
import ch.tutteli.atrium.domain.robstoll.lib.creating.charsequence.contains.builders.CharSequenceContainsBuilder
import ch.tutteli.atrium.domain.robstoll.lib.creating.charsequence.contains.searchbehaviours.NoOpSearchBehaviourImpl
import ch.tutteli.atrium.domain.robstoll.lib.creating.charsequence.contains.searchbehaviours.NotSearchBehaviourImpl
import ch.tutteli.atrium.translations.DescriptionBasic.IS
import ch.tutteli.atrium.translations.DescriptionBasic.IS_NOT
import ch.tutteli.atrium.translations.DescriptionCharSequenceAssertion.*

fun <T : CharSequence> _containsBuilder(subjectProvider: SubjectProvider<T>): CharSequenceContains.Builder<T, NoOpSearchBehaviour> =
    CharSequenceContainsBuilder(subjectProvider, NoOpSearchBehaviourImpl())

fun <T : CharSequence> _containsNotBuilder(subjectProvider: SubjectProvider<T>): CharSequenceContains.Builder<T, NotSearchBehaviour> =
    CharSequenceContainsBuilder(subjectProvider, NotSearchBehaviourImpl())


@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _startsWith(subjectProvider: SubjectProvider<CharSequence>, expected: CharSequence): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, STARTS_WITH, expected) { it.startsWith(expected) }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _startsNotWith(subjectProvider: SubjectProvider<CharSequence>, expected: CharSequence): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, STARTS_NOT_WITH, expected) { !it.startsWith(expected) }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _endsWith(subjectProvider: SubjectProvider<CharSequence>, expected: CharSequence): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, ENDS_WITH, expected) { it.endsWith(expected) }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _endsNotWith(subjectProvider: SubjectProvider<CharSequence>, expected: CharSequence): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, ENDS_NOT_WITH, expected) { !it.endsWith(expected) }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _isEmpty(subjectProvider: SubjectProvider<CharSequence>): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, IS, EMPTY) { it.isEmpty() }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _isNotEmpty(subjectProvider: SubjectProvider<CharSequence>): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, IS_NOT, EMPTY) { it.isNotEmpty() }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun _isNotBlank(subjectProvider: SubjectProvider<CharSequence>): Assertion =
    assertionBuilder.createDescriptive(subjectProvider, IS_NOT, BLANK) { it.isNotBlank() }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun <T : CharSequence> _matches(expect: Expect<T>, expected: Regex): Assertion =
    assertionBuilder.createDescriptive(expect, MATCHES, expected) { it.matches(expected) }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun <T : CharSequence> _mismatches(expect: Expect<T>, expected: Regex): Assertion =
    assertionBuilder.createDescriptive(expect, MISMATCHES, expected) { !it.matches(expected) }
