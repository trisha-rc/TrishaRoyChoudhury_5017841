package bookstore.bookstoreapi_7.mapper;

import bookstore.bookstoreapi_7.dto.BookDTO;
import bookstore.bookstoreapi_7.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO toDTO(Book book);
    Book toEntity(BookDTO bookDTO);
}
