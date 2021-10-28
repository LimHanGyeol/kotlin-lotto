package lotto.domain

object LottoNumberGenerator {

    private const val LOTTO_FIRST_NUMBER = 1
    private const val LOTTO_LAST_NUMBER = 45
    private const val LOTTO_FIRST_INDEX = 0
    private const val LOTTO_LAST_INDEX = 6

    private val lottoNumbers: List<Int> by lazy {
        (LOTTO_FIRST_NUMBER..LOTTO_LAST_NUMBER).toList()
    }

    fun generate(): List<Int> {
        return lottoNumbers
            .shuffled()
            .subList(LOTTO_FIRST_INDEX, LOTTO_LAST_INDEX)
            .sorted()
            .toList()
    }
}
