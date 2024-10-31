package com.cursogit.service;

import java.util.*;
import com.cursogit.model.*;

public interface CursosService {
	
	List<Curso> buscarPorTematica(String tematica);
}
