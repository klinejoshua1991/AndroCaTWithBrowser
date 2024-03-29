package mustafaozhan.github.com.androcat.main.activity

import mustafaozhan.github.com.androcat.base.BaseViewModel

/**
 * Created by Mustafa Ozhan on 2018-07-22.
 */
class MainActivityViewModel : BaseViewModel() {
    override fun inject() {
        viewModelComponent.inject(this)
    }

    fun loadSettings() = getSettings()

    fun updateSetting(
        darkMode: Boolean? = null
    ) = updateSettings(darkMode)
}