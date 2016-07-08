# rest-doc-types



## Mark a metod that returns a list so that content in list will shown in the REST documentation Web page.

I.e. In the Data object for MovieList a link to Movie data object will be shown in Wewb page.

 @DocListType(key = "se.peter.ivarsson.rest.doc.domain.Movie")
 public List<Movie> getMovies() {
 :


## Mark a metod so the real return type will be shown in Web page instead of Response as return type.

I.e. If the type is Response, show real 'return type' instead.
In this case MovieList.

 @DocReturnType(key = "se.peter.ivarsson.rest.doc.domain.MovieList")
 public Response getCurrentMovies(@PathParam(PARAM_CITY_ID) final String cityId,
 :


