package com.wafflestudio.toyproject.memoWithTags.tag.controller

@RestController
class TagController(
    private val tagService: TagService
) {
    @GetMapping("/api/v1/tag")
    fun getTags(): List<TagDto> {
    }

    @PostMapping("/api/v1/tag")
    fun createTag(@RequestBody request: CreateTagRequest): TagDto {
    }

    @PutMapping("/api/v1/tag/{tagId}")
    fun updateTag(@PathVariable id: Long, @RequestBody request: UpdateTagRequest): TagDto {
    }

    @DeleteMapping("/api/v1/tag/{tagId}")
    fun deleteTag(@PathVariable id: Long) {
    }
}

data class TagDto(
    val id: Long,
    val name: String,
    val color: String,
)

data class CreateTagRequest(
    val name: String,
    val color: String
)

data class UpdateTagRequest(
    val name: String,
    val color: String
)