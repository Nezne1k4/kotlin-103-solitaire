import Config.CLUB
import Config.DIAMOND
import Config.HEART
import Config.SPADE

/**
 * Created by Nezneika on 3/18/18.
 */

// Deck is a collection of 52 specific cards

class Deck {
    // each suit has 13 cards
    // how to declare constant?
    private val suitValue = 13

    // define the cards with lambda expression
    val cards: Array<Card> = Array(52, { Card(it % suitValue, getSuit(it)) })

    private fun getSuit(i: Int) = when (i / suitValue) {
        0 -> CLUB
        1 -> DIAMOND
        2 -> HEART
        else -> SPADE
    }

    // card left in deck which will be draw out
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    /**
     * reset the deck with 52 cards and shuffle for ready to play
     */
    fun reset(): MutableList<Card> {
        cardsInDeck = cards.toMutableList()
        return shuffle()
    }

    /**
     * Shuffle the collection for random order
     */
    fun shuffle(): MutableList<Card> {
        cardsInDeck.shuffle()
        return cardsInDeck
    }


//    val cards: Array<Card> = Array(52,
//            // use anonymous function
//            fun(i: Int): Card {
//                val value = i % suitValue
//                val suit = when(i/suitValue) {
//                    0 -> "Club"
//                    1 -> "Diamond"
//                    2 -> "Heart"
//                    else -> "Spade"
//                }
//                return Card(value, suit)
//            }
//    )
}