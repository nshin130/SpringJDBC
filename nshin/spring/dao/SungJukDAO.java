package nshin.spring.dao;

import java.util.List;

import nshin.spring.vo.SungJuk;

public interface SungJukDAO {
	void insertSungJuk(SungJuk sj);

	List<SungJuk> selectAllSungJuk();

	SungJuk selectOneSungJuk(int sjno);

	void updateSungJuk(SungJuk sj);

	void deleteSungJuk(int sjno);
}
