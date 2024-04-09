package example.imageviewer

data class Content(val items: List<Item>) {
    data class Item(val id: Long, val name: String, val desc: String)
}

val elements = Content(
    items = listOf(
        Content.Item(1, "Foo", "this is foo"),
        Content.Item(2, "Bar", "this is bar"),
    )
)
