-- Table: public.pessoa

-- DROP TABLE public.pessoa;

CREATE TABLE public.pessoa
(
  cdPessoa INTEGER PRIMARY KEY NOT NULL, -- Código de pessoa
  nome character varying(200) NOT NULL, -- Nome completo da pessoa
  senha character varying(200) NOT NULL, -- senha convertida em MD5
  email character varying(200) NOT NULL, -- email pra login
  endereco character varying(200), -- rua tal, numero tal, apartamento tal
  cidade character varying(100)
)