package com.joaovictech.appcomposeone.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaovictech.appcomposeone.R
import com.joaovictech.appcomposeone.ui.model.Hero
import com.joaovictech.appcomposeone.ui.model.createHeroList
import com.joaovictech.appcomposeone.ui.theme.AppComposeOneTheme

@Composable
fun ChooseMyFavoriteHeroScreen(modifier: Modifier = Modifier) {
    val heroSelectedIndex = rememberSaveable { mutableIntStateOf(-1) }

    Column(
        modifier = modifier
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(R.string.qual_seu_heroi_favorito),
            style = MaterialTheme.typography.titleLarge
        )
        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
        ChooseHeroList(
            selectedHeroIndex = heroSelectedIndex.intValue,
            heroes = createHeroList(),
            onSelectedHero = { index, selectedHero ->
                heroSelectedIndex.intValue = index
            }
        )
    }
}

@Composable
fun ChooseHeroList(
    modifier: Modifier = Modifier,
    selectedHeroIndex: Int,
    heroes: List<Hero>,
    onSelectedHero: (index: Int, selectedHero: Hero) -> Unit
) {
    //LazyRow LazyColumn LazyVerticalGrid e lazyHorizontalGrid

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        itemsIndexed(items = heroes, key = { index, hero -> hero.hashCode() }) { index, hero ->
            HeroCard(
                modifier = modifier,
                hero = hero,
                isSelector = selectedHeroIndex == index,
                onClick = {
                    onSelectedHero(index, hero)
                }
            )
        }
    }
}

@Composable
fun HeroCard(modifier: Modifier = Modifier, hero: Hero, isSelector: Boolean, onClick: () -> Unit) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = isSelector,
                colors = RadioButtonDefaults.colors(selectedColor = Color.Red),
                onClick = onClick
            )

            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape)
                    .size(64.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = hero.imageRes),
                contentDescription = null
            )

            Column {
                Text(text = hero.name, style = MaterialTheme.typography.titleMedium)
                Text(text = hero.description, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Preview
@Composable
private fun HeroCardPreview() {
    AppComposeOneTheme {
        HeroCard(hero = createHeroList()[0], isSelector = true) {}
    }
}

@Preview(showBackground = true)
@Composable
private fun ChooseMyFavoriteHeroScreenPreview() {
    AppComposeOneTheme {
        ChooseMyFavoriteHeroScreen(modifier = Modifier.fillMaxSize())
    }
}